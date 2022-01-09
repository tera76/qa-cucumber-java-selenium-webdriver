package com.automatedtest.sample.rcaFastquotePage;

import com.automatedtest.sample.basepage.BasePage;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class RcaFastquotePage extends BasePage {


    @FindBy(className = "FastQuoteSidebar__help")
    private WebElement helpIcon;

    @FindBy(className = "mt-5 FastQuoteSidebar__estimate-number")
    private WebElement sidebar_estimate_number;

    @FindBy(className = "mt-1 FastQuoteSidebar__your_summary")
    private WebElement sidebar_summary_title;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div[4]/div[2]/div[2]")
    private WebElement sidebar_decorrenza;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div/div[1]/div[2]")
    private WebElement sidebar_targa;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div[4]/div[5]/div[2]")
    private WebElement sidebar_contraente;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/div/div[2]/div[2]")
    private WebElement sidebar_tipologia;


    @FindBy(className = "OwnerAge__input")
    private WebElement birthDate;

    @FindBy(xpath = "/html/body/div[4]/div/div/form/div[1]/div/div/div/div[2]/select")
    private WebElement antifurto;

    @FindBy(xpath = "/html/body/div[4]/div/div/form/div[1]/div/div/div[2]/div/select")
    private WebElement statoCivile;

    @FindBy(xpath = "/html/body/div[4]/div/div/form/div[2]/div/div/div[2]/div/select")
    private WebElement anno;

    @FindBy(xpath = "/html/body/div[4]/div/div/form/div[3]/div/div/div[2]/div/select")
    private WebElement professione;

    @FindBy(xpath = "/html/body/div[4]/div/div/form/div[5]/div/div/div/div[2]/select")
    private WebElement ricovero;

    @FindBy(xpath = "/html/body/div[4]/div/div/form/div[6]/div/div/div/div[2]/select")
    private WebElement tipoGuida;

    @FindBy(xpath = "/html/body/div[4]/div/div/form/div[4]/div/div/div[2]/div/select")
    private WebElement allestimento;


    @FindBy(xpath = "//*[@id=\"OwnerAge__checkbox\"]")
    private WebElement OwnerAge__checkbox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/div[1]/div/div[2]/label[1]/span")
    private WebElement QuestionaryOne_true;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div/div[2]/label[1]/span")
    private WebElement QuestionaryTwo_true;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div/div/div[2]/div/div[2]/div/div[1]/div[3]/div/div[2]/label[1]/span")
    private WebElement QuestionaryThree_true;


    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div/div/div[2]/div/div[2]/div/div/div[1]/div/div[2]/label[1]/span")
    private WebElement TermAndCondOne_true;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div/div/div[2]/div/div[2]/div/div/div[2]/div/div[2]/label[1]/span")
    private WebElement TermAndCondTwo_true;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[3]/div/div/div/div[2]/div/div[2]/div/div/div[3]/div/div[2]/label[1]/span")
    private WebElement TermAndCondThree_true;


    RcaFastquotePage() {
        PageFactory.initElements(driver, this);
    }


    public void clickHelpIcon() {
        helpIcon.click();
    }

    public void checkSidebarDecorrenza(String expected) {
        Assert.assertEquals("check decorrenza", expected, sidebar_decorrenza.getText());
    }

    public void checkSidebarTarga(String expected) {
        Assert.assertEquals("check targa", expected, sidebar_targa.getText());
    }

    public void checkSidebarContraente(String expected) {
        Assert.assertEquals("check contraente", expected, sidebar_contraente.getText());
    }

    public void checkSidebarTipologia(String expected) {
        Assert.assertEquals("check tipologia", expected, sidebar_tipologia.getText());
    }
    public void checkSidebar(DataTable dt) {
        List<String> key = dt.column(0);
        List<String> value = dt.column(1);
        for (int i = 0; i < key.size(); i++) {
            if (key.get(i).toLowerCase().equals("decorrenza")) checkSidebarDecorrenza(value.get(i));
            if (key.get(i).toLowerCase().equals("targa")) checkSidebarTarga(value.get(i));
            if (key.get(i).toLowerCase().equals("contraente")) checkSidebarContraente(value.get(i));
            if (key.get(i).toLowerCase().equals("tipologia")) checkSidebarTipologia(value.get(i));

        }
    }


    void setBirthDate(String value) {
        for (int i = 0; i < 10; i++) {
            birthDate.sendKeys(Keys.BACK_SPACE);
        }
        birthDate.sendKeys(value);

    }

    public void getCheckData(DataTable dt) {
        List<String> key = dt.column(0);
        List<String> value = dt.column(1);
        for (int i = 0; i < key.size(); i++) {
            if (key.get(i).toLowerCase().equals("statocivile")) checkStatoCivile(value.get(i));
            if (key.get(i).toLowerCase().equals("anno")) checkAnno(value.get(i));
            if (key.get(i).toLowerCase().equals("professione")) checkProfessione(value.get(i));
            if (key.get(i).toLowerCase().equals("allestimento")) checkAllestimento(value.get(i));

        }
    }

    public void setCheckData(DataTable dt) {
        List<String> key = dt.column(0);
        List<String> value = dt.column(1);
        for (int i = 0; i < key.size(); i++) {
            if (key.get(i).toLowerCase().equals("antifurto")) setAntifurto(value.get(i));
            if (key.get(i).toLowerCase().equals("statocivile")) setStatoCivile(value.get(i));
            if (key.get(i).toLowerCase().equals("anno")) setAnno(value.get(i));
            if (key.get(i).toLowerCase().equals("professione")) setProfessione(value.get(i));
            if (key.get(i).toLowerCase().equals("ricovero")) setRicovero(value.get(i));
            if (key.get(i).toLowerCase().equals("tipoguida")) setTipoGuida(value.get(i));
            if (key.get(i).toLowerCase().equals("allestimento")) setAllestimento(value.get(i));

        }
    }

    private void setAntifurto(String s) {
        antifurto.click();
        new Select(antifurto).selectByVisibleText(s);

    }

    private void setStatoCivile(String s) {
        statoCivile.click();
        new Select(statoCivile).selectByVisibleText(s);

    }

    private void checkStatoCivile(String s) {
        Select select = new Select(statoCivile);
        String value = select.getFirstSelectedOption().getText();
        Assert.assertEquals("check StatoCivile", s,value);


    }

    private void checkAllestimento(String s) {
        Select select = new Select(allestimento);
         String value = select.getFirstSelectedOption().getText();
         Assert.assertEquals("check allestimento", s,value);


    }

    private void checkAnno(String s) {
        Select select = new Select(anno);
        String value = select.getFirstSelectedOption().getText();
        Assert.assertEquals("check anno", s,value);


    }

    private void checkProfessione(String s) {
        Select select = new Select(professione);
        String value = select.getFirstSelectedOption().getText();
        Assert.assertEquals("check Professione", s,value);


    }



    private void setAnno(String s) {
        anno.click();
        new Select(anno).selectByVisibleText(s);

    }

    private void setProfessione(String s) {
        professione.click();
        new Select(professione).selectByVisibleText(s);
    }

    void clickOwnerAge_checkbox() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        OwnerAge__checkbox.click();


    }

    void setTermAndCond_checkbox() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        TermAndCondOne_true.click();
        TermAndCondTwo_true.click();
        TermAndCondThree_true.click();

    }

    void setQuestionary_checkbox() {
        Actions action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        QuestionaryOne_true.click();
        QuestionaryTwo_true.click();
        QuestionaryThree_true.click();
    }

    private void setRicovero(String s) {
        ricovero.click();
        new Select(ricovero).selectByVisibleText(s);

    }

    private void setTipoGuida(String s) {
        tipoGuida.click();
        new Select(tipoGuida).selectByVisibleText(s);

    }

    private void setAllestimento(String s) {
        allestimento.click();
        new Select(allestimento).selectByVisibleText(s);

    }

}

