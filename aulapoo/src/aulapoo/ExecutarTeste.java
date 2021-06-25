package aulapoo;

import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("Livro de java");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("Livro de CSS");
		produto2.setValor(BigDecimal.valueOf(50));
		
		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Livro de JavaScrpt");
		produto3.setValor(BigDecimal.valueOf(50));
		
		Produto produto4 = new Produto();
		produto4.setId(4L);
		produto4.setNome("Livro de Hibernate");
		produto4.setValor(BigDecimal.valueOf(100));
		
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda de livro");
		venda.setEnderecoEntrega("Entrega pelo email");
		venda.setId(51L);
		venda.setNomeCliente("Luiz");
		venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);/* JÁ ADICIONA SEM FAZER VALIDAÇÕES*/
		venda.addProduto(produto3); /* DÁ PRA FAZER MAIS VALIDAÇÕES*/
		venda.addProduto(produto4);
		
		
		/*System.out.println("Descrição da venda: " + 
		venda.getDescricaoVenda() + " e o total: "+ 
				venda.totalVenda());*/
		
		System.out.println("Valor da variavel total: "+ venda.getValorTotal());
		
		}
		
	
	}


