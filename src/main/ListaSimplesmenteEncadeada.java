package main;

public class ListaSimplesmenteEncadeada {
	    No cabeca;

	    public void inserir(int dado){
	        No novoNo = new No(dado);
	        if (cabeca == null){
	            cabeca = novoNo;
	        } else {
	            No atual = cabeca;
	            while (atual.proximo != null){
	                atual = atual.proximo;
	            }
	            atual.proximo = novoNo;
	        }

	    }

	    public void excluir(int dado){
	    	No temporario = cabeca;
	        if (temporario != null && temporario.valor == dado){
	            cabeca = temporario.proximo;
	        } else if(temporario != null) {
	            while (temporario.proximo != null && temporario.proximo.valor != dado){
	                temporario = temporario.proximo;
	            }
	            if(temporario.proximo != null )temporario.proximo = temporario.proximo.proximo;
	        }
	    }

	    public void buscar(int dado){
	    	if(cabeca == null) System.out.println("Lista vazia");
	    	else {
	    	boolean encontrado = false;
	        if (cabeca.valor == dado) {
	        	encontrado = true;
	        	} else {
	            	No atual = cabeca;
	            	while (atual != null){
	            		if (atual.valor == dado) {
	            			encontrado = true;	
	            			break;
	            		}
		            	atual = atual.proximo;
	            	}
	         
	        	}
	        
	        	String resultado = (encontrado) ? "foi encontrado" :  "nao foi encontrado"; 
	        	System.out.println("o numero da lista "  + resultado);
	    	}
	    }

	    public void imprimir(){
	    	if(cabeca == null) System.out.println("Lista vazia");
	    	else {
	    		No temporario = cabeca;
	    		System.out.println(temporario.valor);
	    		while (temporario.proximo != null){
	    			temporario = temporario.proximo;
	    			System.out.println(temporario.valor);
	    		} 
	    	}
	    }
	    
	    public void removerRepeticao() {
	    	if(cabeca == null) System.out.println("Lista vazia");
	    	else {
	    		No atual = cabeca;
	    		
	    		while(atual !=null){
	    			No comparador = atual;
	    			while(comparador.proximo != null) {
	    				if(comparador.proximo.valor == atual.valor) {
	    					comparador.proximo = comparador.proximo.proximo;
	    				} else{
	    					comparador = comparador.proximo;
	    				}
	    			}
    				atual = atual.proximo;}
	    	}
	    }
	    
	    public void removerLoop() {
	        if (cabeca == null) return;

	        No lento = cabeca;
	        No rapido = cabeca;
	        boolean temLoop = false;

	        while (rapido != null && rapido.proximo != null) {
	            lento = lento.proximo;
	            rapido = rapido.proximo.proximo;

	            if (lento == rapido) {
	                temLoop = true;
	                break;
	            }
	        }

	        if (!temLoop) return;

	        lento = cabeca;

	        while (lento != rapido) {
	            lento = lento.proximo;
	            rapido = rapido.proximo;
	        }

	        while (rapido.proximo != lento) {
	            rapido = rapido.proximo;
	        }

	        rapido.proximo = null;
	    }
	    
		public No intersecao(No no1, No no2) {
	    	if(no1 != null && no2 != null) {
	    		No atual1 = no1;
	    		
	    		No noInicio = null;
	    		No noFinal = null;
	    		while(atual1 != null) {
	    			No atual2 = no2;
	    			while(atual2 != null) {
	    				if(atual2.valor == atual1.valor) {
	    					No novo = new No(atual1.valor);
	    					
	    					if(noInicio == null) {
	    						noInicio = novo;
	    						noFinal = novo;
	    					}else {
	    						noFinal.proximo = novo;
	    						noFinal = novo;
	    					}
	    					break;
	    					
	    				}
	    				atual2 = atual2.proximo;
	    			}
	    			atual1 = atual1.proximo;
	    		}
	    		
	    		return noInicio;
	    	}
	    	return null;
	    }

}
