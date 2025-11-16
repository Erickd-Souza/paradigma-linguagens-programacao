;Peça o nome e a idade atual do usuário e exiba quantos anos ele terá em 5 anos. Exemplo: Qual é o seu nome? Maria Qual é a sua idade? 18 Maria, daqui a 5 anos você terá 23 anos

(ns atividade.exercicio05)

(defn -main []
    (print "Qual é o seu nome: ") (flush)
    (let [nome (read-line)]
        (print "Qual a sua idade: ") (flush)
        (let [idade (Integer/parseInt (read-line))
            futura (+ idade 5)]
            (println nome ", daqui a 5 anos você terá" futura "anos.")
        )
    )
)