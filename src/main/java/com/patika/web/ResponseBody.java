package com.patika.web;

import com.patika.model.Student;
import com.patika.model.WriterDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Log4j2
public class ResponseBody {

    @GetMapping("/birinci")
    @org.springframework.web.bind.annotation.ResponseBody
    public String birinciMethod() {
        return "Yükleniyor..";
    }

    @GetMapping("/ikinci")
    public String ikinciMethod() {
        return "index";
    }

    @GetMapping("/ucuncu")
    public String ucuncuMethod() {
        return "other/deneme";
    }

    @GetMapping("/dorduncu")
    public String dorduncuMethod(Model model) {
        model.addAttribute("param_key", "Merhabalar Spring Model ile data geldi");
        return "param";
    }

    @GetMapping("/besinci/{param1}")
    public String besinciMethod(Model model, @PathVariable(name = "param1") int sayi) {
        model.addAttribute("param_key", "Merhaba " + sayi);
        return "pathvariable";
    }

    @GetMapping({"/altinci/{param1}", "/altinci"})
    public String altinciMethod(Model model, @PathVariable(name = "param1", required = false) Integer sayi) {
        model.addAttribute("param_key", "Data " + sayi);
        return "pathvariable";
    }

    @GetMapping({"/yedinci/{param1}", "/yedinci"})
    public String yedinciMethod(Model model, @PathVariable(name = "param1", required = false) Integer sayi) {
        if (sayi != null) {
            model.addAttribute("param_key", "Data " + sayi);
        }
        return "pathvariable";
    }

    @GetMapping( "/sekizinci")
    public String sekizinciMethod(Model model, @RequestParam(name = "query") Integer sayi) {
        model.addAttribute("param_key", "Data " + sayi);
        return "pathvariable";
    }

    @GetMapping( "/dokuzuncu")
    public String dokuzuncuMethod(Model model, @RequestParam(name = "query",required = false,defaultValue = "99") Long sayi) {
        model.addAttribute("param_key", "Data " + sayi);
        return "pathvariable";
    }

    @GetMapping( "/onuncu")
    public String onuncuMethod(Model model,
                               @RequestParam(name = "adi",required = false,defaultValue = "adinizi giriniz") String adi,
                               @RequestParam(name = "soyadi",required = false,defaultValue = "soyadinizi giriniz") String soyadi) {
        model.addAttribute("param_key", "Data " + adi +" " + soyadi);
        return "pathvariable";
    }

    @GetMapping( "/onbirinci")
    public String onbirinciMethod(Model model) {
        Student student = Student.builder().name("Turgay").surname("Dede").build();
        model.addAttribute("param_key", student);
        return "pathvariable";
    }

    @GetMapping("/onikinci")
    public String getWriter(Model model) {
        WriterDto writerDto = WriterDto.builder().writerName("adınızı girmediniz").writerSurname("Soyadınızı girmediniz").writerAddress("address girmediniz").writerTelephoneNumber(11122233).build();
        model.addAttribute("form_key", writerDto);
        return "form";
    }

    @PostMapping("/onikinci")
    public String postWriter(Model model, WriterDto writerDto) {
        log.info(writerDto.getId() + " " + writerDto.getWriterName() + " " + writerDto.getWriterSurname() + " " + writerDto.getWriterAddress() + " " + writerDto.getWriterTelephoneNumber());
        model.addAttribute("form_key", writerDto);
        return "formoutput";
    }

}
