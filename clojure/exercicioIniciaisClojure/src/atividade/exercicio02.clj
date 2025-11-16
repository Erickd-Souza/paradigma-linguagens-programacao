; Peça ao usuário um número inteiro e exiba o seu dobro. Exemplo: Digite um número: 7 O dobro é: 14

(ns atividade.exercicio02)

(defn -main []
    (print "Digite um Número: ") (flush)
    (let [n (Integer/parseInt(read-line))]
        (println "O dobro é:"(* 2 n))
    )
)