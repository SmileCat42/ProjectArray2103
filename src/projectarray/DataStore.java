/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectarray;

/**
 *
 * @author Windows10
 */
public class DataStore {
    public static int n=13;
    public static class Products {
        public int code;
        public String name;
        public int type;
        public float price;
        public String pic;

        public void setAll(int a, String b, int c, float d, String e){
            code = a;
            name = b;
            type = c;
            price = d;
            pic = e;
        }
        static int getN(){
            return n;
        }
    }

    public static Products[] list = new Products[15];

    static {
        for (int i = 0; i < list.length; i++) {
            list[i] = new Products();
        }

        // กำหนดข้อมูลตั้งแต่แรก
        list[0].setAll(10233,"Adidas sneaker",1,4600,"/sc/sneakerAdi.jpg");
        list[1].setAll(10472,"Nike sneaker",1,4200,"/sc/sneakerNike.jpg");
        list[2].setAll(10785,"Skecher sneaker",1,2500,"/sc/ske.jpg");
        list[3].setAll(20096,"Umbro Glove",2,800,"/sc/ub.jpg");
        list[4].setAll(20504,"Nike football shirt",2,1500,"/sc/shirtNike.jpg");
        list[5].setAll(30319,"Ping stick golf",3,1300,"/sc/golfstick.jpg");
        list[6].setAll(30873,"Anyday golf bag",3,5000,"/sc/golfbag.jpg");
        list[7].setAll(40152,"Yonex strike",4,2400,"/sc/yon.png");
        list[8].setAll(40197,"Kawasaki strike",4,1700,"/sc/kawa.jpg");
        list[9].setAll(40601,"Victor shuttlecock",4,200,"/sc/shuttle.jpg");
        list[10].setAll(50290,"Puma football",5,800,"/sc/puma.jpg");
        list[11].setAll(50475,"Mikasa volleyball",5,1200,"/sc/volley.jpg");
        list[12].setAll(50290,"Wilson basketball",5,1500,"/sc/wilson.jpg");
    }
}
