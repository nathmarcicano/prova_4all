package tests;


import com.codeborne.selenide.junit5.ScreenShooterExtension;
import common.BaseTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.screenshot;
import static org.testng.Assert.assertEquals;

public class Desafio1 extends BaseTest {

    @Test
    public void adicionarDocesAoCarrinho(){

        $(Constantes.ID_COMBO_CATEGORIA).click();
        $("#category-1").click();
        screenshot("DSF01_01- Selecionando categoria Doces");
        $("#add-product-4-btn").click();
        $("#add-product-5-btn").click();
        screenshot("DSF01_02- Adicionando produtos ao carrinho");
        $(Constantes.ID_COMBO_CATEGORIA).click();
        $("#category-all").click();
        $("#cart-btn").click();
        screenshot("DSF01_04- Acessando o carrinho");
        $("#add-product-4-qtd").click();
        $("#add-product-4-qtd").click();
        $("#add-product-4-qtd").click();
        screenshot("DSF01_05- Aumentando a quantidade do produto");
        screenshot("DSF01_06- Clicando no botão Finalizar");
        $("#finish-checkout-button").click();



        String mensagem = $(".sc-dNLxif").getText();
        assertEquals(mensagem,"Pedido realizado com sucesso!");
        screenshot("DSF01_07- Validando mensagem exibida");
        $(byText("Fechar")).click();
    }



}

