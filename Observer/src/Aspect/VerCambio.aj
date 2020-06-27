package Aspect;

public aspect VerCambio {
    String color;
    pointcut aviso() : call(* update*(..) );
    after(): aviso(){

    }

}
