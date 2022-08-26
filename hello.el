#!/usr/bin/emacs -x

(message "%s" (directory-files "./"))

(with-current-buffer
    (find-file-noselect "lolfile")
  (insert "fo")
  (open-line 1)
  (save-buffer))
