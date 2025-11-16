; Peça uma senha e mostre uma mensagem apenas se for correta (igual a '1234'). Utilize `def` para a senha correta.

(ns atividade.exercicio06)

(def senha-correta "1234")

(defn -main []
    (print "Digite a senha: ") (flush)
    (let [entrada (read-line)]
        (when (= entrada senha-correta)
            (println "Acesso permitido!")
            (println "Bem-vindo ao sistema.") 
        )
    )
)