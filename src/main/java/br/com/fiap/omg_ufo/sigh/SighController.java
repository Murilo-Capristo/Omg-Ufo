package br.com.fiap.omg_ufo.sigh;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/sigh")
public class SighController {

    private final SighService sighService;

    public SighController(SighService sighService){
        this.sighService = sighService;
    }

    @GetMapping
    public String index(Model model){
        System.out.println("Mostrando a pagina de sighs");
        model.addAttribute("sighs", sighService.getAllSighs());
        return "index";
    }

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("sigh", new Sigh());
        return "form";
    }

    @PostMapping("/form")
    public String create(Sigh sigh, RedirectAttributes redirect){
        sighService.save(sigh);
        System.out.println(sigh);
        redirect.addFlashAttribute("message", "Incidência salva com sucesso! :0");
        return "redirect:/sigh";
    }
}
