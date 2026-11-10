public class Convogliodiginevra {
    ListaDouble<? super Vagone> consigliodiginevra;

    public Convogliodiginevra(Locomotiva hed, Locomotiva cods) {
        consigliodiginevra.add(cods);
        consigliodiginevra.add(cods);
        consigliodiginevra.insert(hed, 0);
    }

    public void add(Vagone vags){
        if(vags.getClass().getName().equals("Locomotiva")){
            throw new IllegalArgumentException();
        }
        else this.consigliodiginevra.insert(vags, 1);
    }

    
}
