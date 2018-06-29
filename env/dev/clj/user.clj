(ns user
  (:require [basicsite.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [basicsite.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'basicsite.core/repl-server))

(defn stop []
  (mount/stop-except #'basicsite.core/repl-server))

(defn restart []
  (stop)
  (start))


