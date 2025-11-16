; Leia um número inteiro e informe se ele é par ou ímpar. Considere zero como par.

(ns atividade.exercicio02)

(def rotulo "Resultado: ") 

(defn -main []
    (print "Numero: ") (flush)
    (let [n (Integer/parseInt (read-line)) 
        resto (mod n 2)]
        (if (= resto 0)
            (println rotulo "par")
            (println rotulo "impar")
        )
    )
)