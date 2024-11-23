public class TrafficLight {
    public static void main(String[] args) {
       for(Light light: Light.values()){
           System.out.println(light + ":" + light.getlight());
       }
    }
    enum Light{
        RED{
          public String getlight(){
              return "stop";
          }
        },
        YELLOW{
            public String getlight(){
                return "slow down";
            }
        },
        GREEN{
            public String getlight(){
                return "Go";
            }
        };

        public abstract String getlight();
    }
}
