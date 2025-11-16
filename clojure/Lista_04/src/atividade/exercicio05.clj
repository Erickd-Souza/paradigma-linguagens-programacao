;Crie uma lista com 5 nomes e exiba cada um em uma nova linha com doseq.

(ns atividade.exercicio05)

(def nomes ["Ana" "Bruno" "Carlos" "Diana" "Eduardo"])

(defn -main []
    (doseq [nome nomes]
        (println "Olá," nome "!")
    )
)