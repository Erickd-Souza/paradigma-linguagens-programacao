;Crie uma função `soma-lista` que receba uma lista e calcule a soma dos seus elementos usando recursão.

(ns atividade.exercicio03)

(defn soma-lista [lst]
    (if (empty? lst) 0 
        (+ (first lst) (soma-lista (rest lst)))
    )
)

(defn -main []
    (println "Soma da lista: " (soma-lista '(1 2 3 4 5)))
)