package Menus;



public class FachadaMenus {

    private MenuGestionSecciones mgs;
    private MenuGestionTienda mgt;

    public FachadaMenus() {
        this.mgs = new MenuGestionSecciones();
        this.mgt = new MenuGestionTienda();
    }

    public void iniciarMGSecciones() {
        System.out.println("Iniciando el modulo de gestion de Secciones......");
        mgs = new MenuGestionSecciones();
    }

    public void iniciarMGTienda() {
        System.out.println("Iniciando el modulo de gestion de la Tienda......");
        mgt = new MenuGestionTienda();
    }
}

