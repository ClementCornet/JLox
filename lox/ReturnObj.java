package lox;

public class ReturnObj extends RuntimeException {
    final Object value;
    ReturnObj(Object value){
        super(null,null,false,false);
        this.value = value;
    }
}
