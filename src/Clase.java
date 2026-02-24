
    public class Clase {

        // ATRIBUTOS

        private String  numCuenta;
        private String franquicia;
        private double saldo;

        //Constructor vacio

        public Clase() {
        }


        // Contructor con todos los parametros

        public Clase(String numCuenta, String franquicia, double saldo) {
            this.numCuenta = numCuenta;
            this.franquicia = franquicia;
            this.saldo = saldo;
        }


        //Getter_ Setter

        public String getNumCuenta() {
            return numCuenta;
        }

        public void setNumCuenta(String numCuenta) {
            this.numCuenta = numCuenta;
        }

        public String getFranquicia() {
            return franquicia;
        }

        public void setFranquicia(String franquicia) {
            this.franquicia = franquicia;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }


        //to string


        @Override
        public String toString() {
            return "Clase{" +
                    "numCuenta='" + numCuenta + '\'' +
                    ", franquicia='" + franquicia + '\'' +
                    ", saldo=" + saldo +
                    '}';
        }

        public double depositar(double saldo){
            return (this.saldo + saldo);
        }
    }
