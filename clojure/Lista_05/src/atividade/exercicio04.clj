; Dado um vetor de números, calcule a soma utilizando reduce.
(ns atividade.exercicio04)

(def numeros [10 20 30 40])

(defn -main []
    (println "Soma:" (reduce + numeros))
)