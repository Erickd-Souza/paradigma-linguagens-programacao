;Leia 5 números informados pelo usuário, armazene-os em uma lista e mostre uma nova lista com todos os valores dobrados.

(ns atividade.exercicio01)

(defn ler-numeros [qtd]
    (println "Digite" qtd "números:")
    (loop [i 0 acc []]
        (if (= i qtd)
            acc
            (recur (inc i) (conj acc (Integer/parseInt (read-line))))
        )
    )
)

(defn dobrar-valores [numeros]
    (map #(* 2 %) numeros)
)

(defn -main []
    (let [valores (ler-numeros 5)
        resultado (dobrar-valores valores)]
        (println "Valores originais:" valores)
        (println "Valores dobrados:" resultado)
    )
)