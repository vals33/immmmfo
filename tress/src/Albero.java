public class Albero <T> {
    private class NodoAlbero{
        private T dato;
        private Lista<NodoAlbero> hijos;
        public NodoAlbero(T dato){
            this.dato = dato;
            this.hijos = new Lista<>();
        }

        public T getDato() {
            return dato;
        }

        public void setDato(T dato) {
            this.dato = dato;
        }

        public Lista<NodoAlbero> getHijos() {
            return hijos;
        }

        public void setHijos(Lista hijos) {
            this.hijos = hijos;
        }
    }
    private NodoAlbero radice;
    public void stampaAlbero(){
        stampaRic(this.radice);
    }
    public void stampaRic(NodoAlbero n){
        if(n == null){
            return;
        }
        System.out.println(n.getDato());
        n.getHijos().forEach(f -> stampaRic(f));
    }
}
