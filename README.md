Problemas
===============

 ### 1. [Álbum da Copa](https://olimpiada.ic.unicamp.br/pratique/pj/2018/f1/album/)
 ### 2. [Cápsulas](https://olimpiada.ic.unicamp.br/pratique/pj/2018/f2/capsulas/)
 ### 3. [Multilples of 3 and 5](https://projecteuler.net/problem=1)
 ### 4. [Even Fibonacci numbers](https://projecteuler.net/problem=2)
 
Soluções
===============
1) 
    O problema *Álbum da Copa* é um problema relativamente simples, a questão quer saber quantas figurinhas **únicas** M falta para completar um álbum de tamanho n.  
    A entrada é o tamanho do álbum e a quantidade de figurinhas que a pessoa já tem, o único problema é que ela pode ter figurinhas repetidas.
    Para retirar as figurinhas repetidas iremos armazenar as figurinhas usando uma estrutura de dados que não aceita itens repetidos, o **HashSet**.
    ``` java
     Set<Integer>figurinhas = new HashSet<Integer>();
        for(int i =0;i<m;i++) {
        	figurinhas.add(s.nextInt());
        }
    ```
    Depois de armazenar todas as figurinhas únicas falta apenas subtrair o tamanho do álbum pelo tamanho da estrutura
    ``` java
    System.out.println(n-figurinhas.size());
    ```
    <hr>
2) O problema Cápsulas é um problema de busca, tive alguns problemas com ele pois todas as minha submissões na linguagem Java obtiveram apenas 90 pontos do 100, acusando que em alguns testes a resposta estava incorreta, até que procurei a solução na internet em outra linguagem, c++, que era basicamente a mesma coisa, submeti a solução nessa linguagem e obtive 100 pontos, deve existir algum caso nos teste da linguagem Java que possui algum caso específico ou algum erro. 


    No problema da Cápsula é um problema de busca em que os valores estão ordenados crescentemente, o problema é que os vetores de dias tem um valor muito alto para utilizar a busca linear, e como os valores são sempre crescentes então é possível utilizar a busca binária, que avalia o meio do vetor, se for menor quer dizer que o valor desejado está na primeira metade do vetor, se for maior quer dizer que o valor desejado está na segunda metade do vetor.
    ``` java
        int menor = 1;int menor = 1;
        int maior = 1000000000;
        int media = 0;
        while(menor<maior) {
        	media = (menor+maior)/2;
        	if(total(moedas,media)>=f) {
        		maior = media;
        	}else {
        		menor = media+1;
        	}
        }        
    ```
    
3. Problema matématico simples, encontrar a soma de todos os múltiplos de 3 e 5 entre 0 e 1000. Fiz um for de 0 a 1000 e caso o módulo de 3 ou 5 seja 0 isso significa que o numero é um múltiplos de um dos 2, então adiciono eles a variável sum
 ```python
    sum=0
    for i in range(0,1000):
        if i % 3 == 0 or i % 5 == 0:
            sum+=i    
    print(sum)
 ```
    
4. Problema matématico simples, encontrar a soma de todos os numeros fibonacci pares até que o maior termo da sequencia não ultrapasse 4.000.000
![alt text](http://www.cs.utsa.edu/~wagner/CS3343/fib/f1.png "Logo Title Text 1")
