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
    }

    public static Products[] list = new Products[15];

    static {
        for (int i = 0; i < list.length; i++) {
            list[i] = new Products();
        }

        // กำหนดข้อมูลตั้งแต่แรก
        list[0].setAll(10233,"Adidas sneaker",1,4600,"001");
        list[1].setAll(10472,"Nike sneaker",1,4200,"002");
        list[2].setAll(10785,"Skecher sneaker",1,2500,"003");
        list[3].setAll(20096,"Umbro Glove",2,800,"004");
        list[4].setAll(20504,"Nike football shirt",2,1500,"005");
        list[5].setAll(30319,"Ping stick golf",3,1300,"006");
        list[6].setAll(30873,"Anyday golf bag",3,5000,"007");
        list[7].setAll(40152,"Yonex strike",4,2400,"008");
        list[8].setAll(40197,"Kawasaki strike",4,1700,"009");
        list[9].setAll(40601,"Victor shuttlecock",4,200,"010");
        list[10].setAll(50290,"Puma football",5,800,"011");
        list[11].setAll(50475,"Mikasa volleyball",5,1200,"012");
        list[12].setAll(50290,"Wilson basketball",5,1500,"013");
    }
}
