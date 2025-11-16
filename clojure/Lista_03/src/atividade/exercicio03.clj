; Calcule o valor de uma passagem com base na idade: <6 grátis, 6–17 metade, 18–59 inteira, >=60 desconto de 75%.

(ns atividade.exercicio03)

(def tarifa-base 10.0)

(defn -main []
    (println "Digite a idade: ") (flush)
    (let [idade (Integer/parseInt (read-line))
        valor (cond
                (< idade 6) 0.0
                (< idade 18) (* tarifa-base 0.5)
                (< idade 60) tarifa-base 
                :else (* tarifa-base 0.25)
              )]
        (println "Valor da passagem: R$" valor)
    )
)