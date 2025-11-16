;Demonstre que um conjunto não aceita repetição ao tentar inserir um elemento que já existe.

(ns atividade.exercicio05)

(def conjunto-inicial #{1 2 3})

(defn -main []
    (let [novo (conj conjunto-inicial 2)]
        (println "Original:" conjunto-inicial)
        (println "Após conj 2:" novo)
    )
)