(ns avbooth-checklist.views.video
  (:require [avbooth-checklist.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage defpartial]]
        [hiccup.core :only [html]]
        [hiccup.form-helpers]))

(def pre-checks (atom []))

(def post-checks (atom []))

(defn add-pre-check [task]
  (swap! pre-checks conj task))

(defn add-post-check [task]
  (swap! post-checks conj task))

(add-pre-check "Turn on the outside monitor")
(add-pre-check "Turn on all monitors in the booth")
(add-pre-check "Set out camera to the correct view")


(defpartial item [t]
  [:label.checkbox [:li (check-box t) t]])

(defpage [:get "/video"] []
  (common/layout
   [:h1 [:p [:strong "Pre Service Check List"]]]
   [:form.well
    [:div#pre
    [:ul.unstyled
     (map item @pre-checks)]]]
   [:h1 [:p "Post Server Check List"]]))
