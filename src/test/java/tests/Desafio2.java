package tests;

import common.BaseTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.screenshot;
import static org.testng.Assert.assertEquals;

public class Desafio2 extends BaseTest {


    @Test
    public void adicionarBebidaseSalgado(){

    $(Constantes.ID_COMBO_CATEGORIA).click();
        $("#category-0").click();
        screenshot("DSF02_01- Selecionando categoria Bebidas");
        $("#add-product-0-btn").click();
        $("#add-product-1-btn").click();
        $("#add-product-2-btn").click();
        screenshot("DSF02_02- Adicionando produtos no carrinho");
        $(Constantes.ID_COMBO_CATEGORIA).click();
        $("#category-all").click();
        $("#add-product-3-btn").click();
        screenshot("DSF02_03- Adicionando salgado");
        $("#cart-btn").click();
        screenshot("DSF02_04- Acessando o carrinho");
        $("#add-product-3-qtd").click();
        $("#add-product-3-qtd").click();
        $("#add-product-3-qtd").click();
        $("#add-product-3-qtd").click();
        $("#add-product-3-qtd").click();
        $("#add-product-3-qtd").click();
        $("#add-product-3-qtd").click();
        $("#add-product-3-qtd").click();
        screenshot("DSF02_05- Adicionando salgados");
        $("#remove-product-3-qtd").click();
        $("#remove-product-3-qtd").click();
        $("#remove-product-3-qtd").click();
        $("#remove-product-3-qtd").click();
        screenshot("DSF02_06- Removendo salgados");

        String total = $("#price-total-checkout").getText();
        assertEquals(total, "R$ 36,00");
        screenshot("DSF02_07- Validando o valor total de produtos");

        $("#finish-checkout-button").click();

        String mensagem = $(".sc-dNLxif").getText();
        assertEquals(mensagem,"Pedido realizado com sucesso!");
        screenshot("DSF02_08- Validando mensagem exibida");
        $(byText("Fechar")).click();

    }

}

