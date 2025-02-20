package com.lucasMotta.ESTOQUEFOX.Controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.lucasMotta.ESTOQUEFOX.Repositories.PedidoRepository;
import com.lucasMotta.ESTOQUEFOX.models.Pedido;
import com.lucasMotta.ESTOQUEFOX.services.ExcelService;



@Controller
public class HomeController {
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	@Autowired
	ExcelService excelService;
	
	@GetMapping("/")
	public String getHomePage(Model model) {
		Pedido p1 = new Pedido();
		model.addAttribute("pedido", p1);
		
		return "index";
	}
	
	@PostMapping("/pedir")
	public String postMethodName(@ModelAttribute Pedido pedido) {
		pedidoRepository.save(pedido);
		
		return "redirect:/";
	}
	
	@GetMapping("/listaPedidos")
	public String getListaPedidosPage(Model model) {
		List<Pedido> pedidos = pedidoRepository.findAll();
		
		model.addAttribute("pedidos", pedidos);
		
		return "listaPedidos";
	}
	
	@GetMapping("/pedido/{id}")
	public String getPedido(Model model,@PathVariable Long id) {
		Pedido pedido = pedidoRepository.findById(id).get();
		
		model.addAttribute("pedido", pedido);
		
		return "pedido";
		
	}
	
	@GetMapping("/download-excel")
	public ResponseEntity<ByteArrayResource> downloadExcel() throws IOException {
	    List<Pedido> pedidos = pedidoRepository.findAll(); 
	    byte[] excelBytes = excelService.generateExcel(pedidos);

	   
	    ByteArrayResource resource = new ByteArrayResource(excelBytes);
	    HttpHeaders headers = new HttpHeaders();
	    headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=pedidos.xlsx");

	    return ResponseEntity.ok()
	            .headers(headers)
	            .contentLength(excelBytes.length)
	            .contentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
	            .body(resource);
	}
	

}
