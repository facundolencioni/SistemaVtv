
package Sist_Vtv.Controladores;

import Sist_Vtv.Domain.Inspector;
import Sist_Vtv.Servicio.InspectorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author facu_
 */

@Controller
@Slf4j
@RequestMapping(path = "/inspector")
public class ControladorInspector {
  @Autowired
  private InspectorService inspectorSimp;

  
  @GetMapping("/")
  public String inicio(Model model){
      model.addAttribute("inspectors", inspectorSimp.listarInspector());
      return "inspector";
  }
  @GetMapping("/agregar")
    public String agregar(Inspector inspector){
        return "modificarInspector";
    }
    @PostMapping("/guardar")
    public String guardar(Inspector inspector){
        inspectorSimp.guardar(inspector);
        return "redirect:/inspector/";
    }
    
    @GetMapping("/editar/{idInspector}")
    public String editar(Inspector inspector, Model model){
        inspector = inspectorSimp.encontrarInspector(inspector);
        model.addAttribute("inspector", inspector);
        return "modificarInspector";
    }
    
    @GetMapping("/eliminar/{idInspector}")
    public String eliminar(Inspector inspector){
      inspectorSimp.eliminar(inspector);
        return "redirect:/inspector/";
    }
    @GetMapping("/info/{idInspector}")
    public String info(Model model, Inspector inspector) {
    	inspector = inspectorSimp.encontrarInspector(inspector);
    	model.addAttribute("inspector", inspector);
    	return "inspectorVtv";
    }
}
