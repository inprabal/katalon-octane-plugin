package com.hpe.adm.nga.sdk.enums.lists.list_node.gherkin_dialect;

import com.hpe.adm.nga.sdk.model.EntityModel;
import com.hpe.adm.nga.sdk.model.StringFieldModel;
import java.util.Arrays;

/**
 * Generated class - do not edit!
 */
public enum GherkinDialect {

            AF("list_node.gherkin_dialect.af")        , AM("list_node.gherkin_dialect.am")        , AN("list_node.gherkin_dialect.an")        , AR("list_node.gherkin_dialect.ar")        , AST("list_node.gherkin_dialect.ast")        , AZ("list_node.gherkin_dialect.az")        , BG("list_node.gherkin_dialect.bg")        , BM("list_node.gherkin_dialect.bm")        , BS("list_node.gherkin_dialect.bs")        , CA("list_node.gherkin_dialect.ca")        , CS("list_node.gherkin_dialect.cs")        , CY_GB("list_node.gherkin_dialect.cy-GB")        , DA("list_node.gherkin_dialect.da")        , DE("list_node.gherkin_dialect.de")        , EL("list_node.gherkin_dialect.el")        , EM("list_node.gherkin_dialect.em")        , EN("list_node.gherkin_dialect.en")        , EN_SCOUSE("list_node.gherkin_dialect.en-Scouse")        , EN_AU("list_node.gherkin_dialect.en-au")        , EN_LOL("list_node.gherkin_dialect.en-lol")        , EN_OLD("list_node.gherkin_dialect.en-old")        , EN_PIRATE("list_node.gherkin_dialect.en-pirate")        , EO("list_node.gherkin_dialect.eo")        , ES("list_node.gherkin_dialect.es")        , ET("list_node.gherkin_dialect.et")        , FA("list_node.gherkin_dialect.fa")        , FI("list_node.gherkin_dialect.fi")        , FR("list_node.gherkin_dialect.fr")        , GA("list_node.gherkin_dialect.ga")        , GJ("list_node.gherkin_dialect.gj")        , GL("list_node.gherkin_dialect.gl")        , HE("list_node.gherkin_dialect.he")        , HI("list_node.gherkin_dialect.hi")        , HR("list_node.gherkin_dialect.hr")        , HT("list_node.gherkin_dialect.ht")        , HU("list_node.gherkin_dialect.hu")        , ID("list_node.gherkin_dialect.id")        , IS("list_node.gherkin_dialect.is")        , IT("list_node.gherkin_dialect.it")        , JA("list_node.gherkin_dialect.ja")        , JV("list_node.gherkin_dialect.jv")        , KA("list_node.gherkin_dialect.ka")        , KN("list_node.gherkin_dialect.kn")        , KO("list_node.gherkin_dialect.ko")        , LT("list_node.gherkin_dialect.lt")        , LU("list_node.gherkin_dialect.lu")        , LV("list_node.gherkin_dialect.lv")        , MK_CYRL("list_node.gherkin_dialect.mk-Cyrl")        , MK_LATN("list_node.gherkin_dialect.mk-Latn")        , MN("list_node.gherkin_dialect.mn")        , MR("list_node.gherkin_dialect.mr")        , NE("list_node.gherkin_dialect.ne")        , NL("list_node.gherkin_dialect.nl")        , NO("list_node.gherkin_dialect.no")        , PA("list_node.gherkin_dialect.pa")        , PL("list_node.gherkin_dialect.pl")        , PT("list_node.gherkin_dialect.pt")        , RO("list_node.gherkin_dialect.ro")        , RU("list_node.gherkin_dialect.ru")        , SK("list_node.gherkin_dialect.sk")        , SL("list_node.gherkin_dialect.sl")        , SR_CYRL("list_node.gherkin_dialect.sr-Cyrl")        , SR_LATN("list_node.gherkin_dialect.sr-Latn")        , SV("list_node.gherkin_dialect.sv")        , TA("list_node.gherkin_dialect.ta")        , TE("list_node.gherkin_dialect.te")        , TH("list_node.gherkin_dialect.th")        , TLH("list_node.gherkin_dialect.tlh")        , TR("list_node.gherkin_dialect.tr")        , TT("list_node.gherkin_dialect.tt")        , UK("list_node.gherkin_dialect.uk")        , UR("list_node.gherkin_dialect.ur")        , UZ("list_node.gherkin_dialect.uz")        , VI("list_node.gherkin_dialect.vi")        , ZH_CN("list_node.gherkin_dialect.zh-CN")        , ZH_TW("list_node.gherkin_dialect.zh-TW")    ;

    public static final String ROOT_ID = "list_node.gherkin_dialect";

    private final String id;

    GherkinDialect(final String id) {
        this.id = id;
    }

    public final String getId() {
        return id;
    }

    public static GherkinDialect getListNodeFromId(String id) {
        return Arrays.stream(GherkinDialect.values()).filter(listNode -> listNode.id.equals(id)).findFirst().orElse(null);
    }

    public final EntityModel getAsEntityModel() {
        final EntityModel entityModel = new EntityModel();
        entityModel.setValue(new StringFieldModel("id", id));
        entityModel.setValue(new StringFieldModel("type", "list_node"));
        return entityModel;
    }

    public static GherkinDialect getFromEntityModel(final EntityModel entityModel) {
        return GherkinDialect.getListNodeFromId(entityModel.getId());
    }
}
