#!/usr/bin/env bb

(require '[cheshire.core :as json])

(defn main []
  (when-not (fs/exists? "hurr") (fs/copy "hello.clj" "hurr"))
  (println (->> (range) (take 10)))
  (println (json/decode "{\"foo\": 10}")))

(main)
