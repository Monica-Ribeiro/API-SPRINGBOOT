package com.example.lojasgamesback.repository;
import com.example.lojasgamesback.model.Jogo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    private List<Jogo> jogos = new ArrayList<>();
     public BancoDeDados(){
         this.jogos.add(new Jogo(1, "What Dogs Legion", "Blablabla", 49.99, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQckX6nKawC-vc27cLTsCSRJXLhNKQ8bkE1y4__7tYCBcDkfCFSD-VdYtaiV_SDwjg-K0&usqp=CAU",false));
         this.jogos.add(new Jogo(2, "What Dogs Legion", "Blablabla", 39.99, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQckX6nKawC-vc27cLTsCSRJXLhNKQ8bkE1y4__7tYCBcDkfCFSD-VdYtaiV_SDwjg-K0&usqp=CAU", false));
         this.jogos.add(new Jogo(3, "What Dogs Legion", "Blablabla", 29.99, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQckX6nKawC-vc27cLTsCSRJXLhNKQ8bkE1y4__7tYCBcDkfCFSD-VdYtaiV_SDwjg-K0&usqp=CAU", false));
         this.jogos.add(new Jogo(4, "What Dogs Legion", "Blablabla", 59.99, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQckX6nKawC-vc27cLTsCSRJXLhNKQ8bkE1y4__7tYCBcDkfCFSD-VdYtaiV_SDwjg-K0&usqp=CAU", false));
     }

     public List<Jogo>findAll(){
         return jogos;
     }

     public Jogo save(Jogo jogo){
         for (Jogo jogoNaLista: jogos){
             if(jogo.getId() == jogoNaLista.getId()){
                 return  null;
             }
         }
         jogos.add(jogo);
         return jogo;
     }


}
