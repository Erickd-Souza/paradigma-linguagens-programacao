;Escreva um programa que exiba os números de 1 a 10 utilizando loop e recur.

(ns atividade.exercicio01)

(defn -main []
    (loop [i 1]
        (when (<= i 10)
            (println i)
            (recur (inc i))
        )
    )
)