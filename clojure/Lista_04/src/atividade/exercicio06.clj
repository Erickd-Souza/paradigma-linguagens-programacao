;Crie uma lista de preços e exiba cada valor formatado em reais (R$) utilizando doseq.

(ns atividade.exercicio06)

(def precos [19.9 5.5 10.0 3.25])

(defn -main []
    (doseq [p precos]
        (println "Preço:" (format "R$ %.2f" p))
    )
)