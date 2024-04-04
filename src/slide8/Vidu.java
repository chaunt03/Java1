package slide8;

    class MemberOuterExample {
        private static int data = 30;
    
        class Inner {
            void msg() {
                System.out.println("data is "+ data);
            }
        }
        static class Inner2 {
            void msg() {
                System.out.println("data is "+ data);
            }
        }
        public static void main(String[] args) {
            MemberOuterExample obj = new MemberOuterExample();
            MemberOuterExample.Inner in = obj.new Inner();
            in.msg();
        }
    }