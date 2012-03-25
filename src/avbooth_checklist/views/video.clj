(ns avbooth-checklist.views.video
  (:require [avbooth-checklist.views.common :as common]
            [noir.content.getting-started])
  (:use [noir.core :only [defpage defpartial]]
        [hiccup.core :only [html]]
        [hiccup.form-helpers]
        [avbooth-checklist.models.video]))

(defpartial build-section [type tasks]
  [:div#pre
   [:ul.unstyled
    (for [t tasks]
      [:label.checkbox [:li (check-box (str type (:id t))) (:task t)]])]])

(defpage [:get "/video"] []
  (common/layout
   [:div.container-fluid
    [:div.row-fluid
     [:div.span10
      [:h2 [:p [:strong "Pre Service Check List"]]]
      [:form.well (build-section "pre" (get-pre-checks))]
      [:h2 [:p "Post Server Check List"]]]]]))
