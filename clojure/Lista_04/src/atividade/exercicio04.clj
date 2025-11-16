;Exiba na tela 5 vezes a mensagem 'Clojure é incrível!' utilizando dotimes.

(ns atividade.exercicio04)

(defn -main []
    (dotimes [i 5]
        (println "Clojure é incrivel vez" (inc i))
    )
)