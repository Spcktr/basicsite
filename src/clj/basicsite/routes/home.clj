(ns basicsite.routes.home
  (:require [basicsite.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))

(defn home-page []
  (layout/render
    "home.html" {:docs (-> "docs/docs.md" io/resource slurp)}))

(defn about-page []
  (layout/render
    "about.html"))

(defn new-index []
  (layout/render
    "newindex.html"))

(defroutes home-routes
  (GET "/" [] (new-index))
  (GET "/about" [] (about-page))
  (GET "/new" [] (new-index)))
