; Dada uma lista de números, dobre cada elemento e calcule a soma total usando encadeamento `->>`.

(ns atividade.exercicio04)

(defn -main []
    (let [numeros [1 2 3 4 5]
        resultado (->> numeros (map #(* 2 %))(reduce +))
    ]
        (println "Soma dos valores dobrados: " resultado)
    )
)