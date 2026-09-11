public class draft {
    public class first{
        private final StringBuilder sb = new StringBuilder("ASDASD");
        public first setFirst(String a){
            sb.append("LALA");
            return this;
        }

        @Override
        public String toString() {
            return sb.toString();
        }
    }
    first f = new first();


}
