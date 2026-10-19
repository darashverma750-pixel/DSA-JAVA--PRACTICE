public class constructor {
    public static class Pokemon {
        int power;
        String type;

        public Pokemon() {  // default constructor
        }

        public Pokemon(int power, String type) {
            this.power = power;
            this.type = type;
        }
        void print(){
            System.out.println(power+" "+type);
        }
        
        
    }
    public static void main(String[] args) {
    Pokemon Pickachu = new Pokemon(70,"electric");
    Pickachu.print();    
    }

    }
    
