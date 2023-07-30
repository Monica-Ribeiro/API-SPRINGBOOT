package com.example.cosmetico.repository;
import com.example.cosmetico.model.CosmeticoModel;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
@Component
public class BancoDeDados {
    List<CosmeticoModel> cosmeticoModels = new ArrayList<>();
    public BancoDeDados(){
        cosmeticoModels.add(new CosmeticoModel(1, "Batom", 17.50, "https://static.cdnlive.com.br/uploads/724/produto/16820028581745_zoom.jpg"));
        cosmeticoModels.add(new CosmeticoModel(2, "Perfume", 199.90, "https://m.media-amazon.com/images/I/61WZ84jU3gL._AC_SX522_.jpg"));
        cosmeticoModels.add(new CosmeticoModel(3, "Shampoo", 21.99, "https://veggue.com.br/wp-content/uploads/2020/07/shampoo-500x500-1.jpg"));
        cosmeticoModels.add(new CosmeticoModel(4, "Creme Hidratante Facial", 67.90, "https://epocacosmeticos.vteximg.com.br/arquivos/ids/524280-500-500/Hidratante-Facial-Nivea---Creme-Facial-Nutritivo---100g-4--1-.jpg?v=638060201827400000"));
    }
    //aqui é um método que permite visualizar todos os itens na lista
    public List<CosmeticoModel> findAll(){
        return cosmeticoModels;
    }
    public String save(CosmeticoModel cosmeticoModel){
        for (CosmeticoModel cosmeticoModel1: cosmeticoModels){
            if (cosmeticoModel.getId() == cosmeticoModel1.getId()){
                return "Este cosmetico ja foi adicionado";
            }
        }
        cosmeticoModels.add(cosmeticoModel);
        return "Produto " + cosmeticoModel.getNome() + " foi adicionado";
    }

    public String delete(int id){
        for (CosmeticoModel cosmetico: cosmeticoModels){
            if (cosmetico.getId() == id){
                cosmeticoModels.remove(cosmetico);
                return "Produto " + cosmetico.getNome() + " foi removido com sucesso";
            }
        }
        return "Produto não encontrado";
    }

}
