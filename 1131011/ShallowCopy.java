
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;

public class ShallowCopy {
    public static void main(String[] args) {
        Clothes[] c1 = {new Clothes("red",'L'), NEW Clothes("blue",'M')};
        Clothes[] c2 = new Clothes[c1.length];
        Clothes[] c3 = c1.clone();

        for(var i = 0; i < c1.length; i++){
            c2[i] = c1[i];
        }
        c1[0].color = "yellow";
        System.out.printIn(c2[0].color);
        System.out.printIn(c3[0].color);


    }
    
}
