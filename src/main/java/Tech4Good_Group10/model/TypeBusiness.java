package Tech4Good_Group10.model;

public enum TypeBusiness {
    SERVICIOS_EMPRESARIALES("Serveis a les empreses i oficines"),
    ACTIVIDADES_EMMAGATZEMATGE("Activitats emmagatzematge"),
    ADMINISTRACION("Administració"),
    ACTIVIDADES_TRANSPORTE("Activitats de transport"),
    VEHICULOS("Vehicles"),
    RESTAURANTES("Restaurants"),
    MATERIAL_EQUIPAMIENTO_LLAR("Material equipament llar"),
    CARNI_PORC("Carn i Porc"),
    OTROS("Altres"),
    PEIX_MARISC("Peix i marisc"),
    FLORISTERIAS("Floristeries"),
    FRUITAS_VERDURAS("Fruites i verdures"),
    DROGUERIA_PERFUMERIA("Drogueria i perfumeria"),
    VESTIR("Vestir"),
    OUS_AUS("Ous i aus"),
    PA_PASTISSERIA_LACTICS("Pa, pastisseria i làctics"),
    BASARS("Basars"),
    PLATS_PREPARATS("Plats preparats (no degustació)"),
    FARMACIAS_PARAFARMACIA("Farmàcies PARAFARMÀCIA"),
    ENSENYAMENT("Ensenyament"),
    SIN_INFORMACION("Sense informació"),
    SOUVENIRS("Souvenirs"),
    REPARACIONES("Reparacions (Electrodomèstics i automòbils)"),
    AUTOSERVICIO_SUPERMERCADO("Autoservei / Supermercat"),
    SANIDAD_ASISTENCIA("Sanitat i assistència"),
    SIN_INFORMACION_ACTIVIDAD("Sense informació - Havia tingut activitat (rètol)"),
    FINANZAS_SEGUROS("Finances i assegurances"),
    SERVICIOS_ALOJAMIENTO("serveis d'allotjament"),
    BARES_CIBERCAFE("Bars / CIBERCAFÈ"),
    EQUIPAMIENTOS_CULTURALES_RECREATIVOS("Equipaments culturals i recreatius"),
    EN_REFORMA("En reforma"),
    MERCERIA("Merceria"),
    LOCALES_BUITOS_VENTA_ALQUILER("Locals buits en venda i lloguer"),
    ARTES_GRAFICAS("Arts gràfiques"),
    CENTROS_ESTETICA("Centres d'estètica"),
    CALZADO_PIEL("Calçat i pell"),
    XOCOLATERIAS_GELADERIAS_DEGUSTACION("Xocolateries / Geladeries / Degustació"),
    ACTIVIDADES_INDUSTRIALES("Activitats industrials"),
    PARAMENT_FERRETERIA("Parament ferreteria"),
    ACTIVIDADES_INMOBILIARIAS("Activitats immobiliàries"),
    OTROS_EQUIPAMIENTOS_DEPORTIVOS("Altres equipaments esportius"),
    LOCALES_BUITOS_ALQUILER("Locals buits en lloguer"),
    MOBLES_ARTICULOS_FUSTA_METAL("Mobles i articles fusta i metall"),
    FABRICACION_TEXTIL("Fabricació tèxtil"),
    LOCALES_BUITOS_VENTA("Locals buits en venda"),
    PERRUQUERIAS("Perruqueries"),
    TABACO_ARTICULOS_FUMADORES("Tabac i articles fumadors"),
    SERVICIOS_MENAJE_TAKE_AWAY("Serveis de menjar take away MENJAR RÀPID"),
    SERVICIOS_SOCIALES("Serveis Socials"),
    ASOCIACIONES("Associacions"),
    INFORMATICA("Informàtica"),
    GIMNASIO_FITNESS("Gimnàs /fitnes"),
    ACTIVIDADES_TRANSPORTE_EMMAGATZEMATGE("Activitats de transport i emmagatzematge"),
    ACTIVIDADES_CONSTRUCCION("Activitats de la construcció"),
    JUGUETES_DEPORTES("Joguines i esports"),
    LIBROS_DIARIOS_REVISTAS("Llibres, diaris i revistes"),
    JOYERIA_RELOJERIA_BIJUTERIA("Joieria, rellotgeria i bijuteria"),
    GRANDES_SUPERMERCADOS_HIPERMERCADOS("Grans magatzems i hipermercats"),
    APARATOS_DOMESTICOS("Aparells domèstics"),
    MANTENIMIENTO_LIMPIEZA_SIMILARES("Manteniment, neteja i similars"),
    VETERINARIOS_MASCOTAS("Veterinaris / Mascotes"),
    HERBOLARIOS_DIETETICA_NUTRICION("Herbolaris, dietètica i NUTRICIÓ"),
    BARES_ESPECIALES("Bars especials amb actuació / Bars musicals / Discoteques /PUB"),
    SOUVENIRS_BASARS("Souvenirs i basars"),
    BEBIDAS("Begudes"),
    PARKINGS_GARAJES("Pàrquings i garatges"),
    TINTORERIAS("Tintoreries"),
    FOTOGRAFIA("Fotografia"),
    ARREGLOS("Arranjaments"),
    OPTICAS("Òptiques"),
    AGENCIAS_VIAJE("Agències de viatge"),
    SELLOS_MONEDAS_ANTIGUEDADES("Segells, monedes i antiguitats"),
    SERVICIOS_TELECOMUNICACIONES("Serveis de telecomunicacions"),
    SERVICIOS_COMIDA_BEBIDAS("serveis de menjar i begudes"),
    EQUIPAMIENTOS_RELIGIOSOS("Equipaments religiosos"),
    COMBUSTIBLES_CARBURANTES("Combustibles i carburants"),
    MUSICA("Música"),
    LOCUTORIOS("Locutoris"),
    MAQUINARIA("Maquinària"),
    DEPORTES("Esports"),
    OPTICAS_FOTOGRAFIA("Òptiques i fotografia");




    private String name;

    TypeBusiness(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}