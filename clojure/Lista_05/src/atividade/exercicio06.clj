; Escreva uma função que receba um vetor e retorne um novo vetor apenas com os valores pares.

(ns atividade.exercicio06)

(defn apenas-pares [v]
    (into [] (filter even? v))
)

(defn -main []
    (println (apenas-pares [1 2 3 4 5 6 7 8]))
)