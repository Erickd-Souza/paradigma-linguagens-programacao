;Leia três inteiros e determine o maior valor utilizando apenas 'if'.

(ns atividade.exercicio05)

(def rotulo "Maior: ")

(defn -main []
    (println "Digite três números: ")
    (let [a (Integer/parseInt (read-line))
        b (Integer/parseInt (read-line))
        c (Integer/parseInt (read-line))
        maior-ab (if (>= a b)
                   a b
                 )
        maior (if (>= maior-ab c)
                  maior-ab c       
              )
        ]
        (println rotulo maior)
    )
)