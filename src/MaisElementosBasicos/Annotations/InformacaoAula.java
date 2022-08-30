package MaisElementosBasicos.Annotations;

public @interface InformacaoAula {

    String autor();
    int aulaNumero();
    String site() default  "http://loiane.training";

}
