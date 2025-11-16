;Peça  três números inteiros e exiba a média. Exemplo: Digite três números: 10 20 30 A média é:20.0

(ns atividade.exercicio03)

(defn -main []
    (println "Digite três números:")
    (let [  a (Integer/parseInt(read-line))
            b (Integer/parseInt (read-line))
            c (Integer/parseInt (read-line))
            media (/ (+ a b c) 3.0)
         ]
         (println "A média é:" media)
    )
)