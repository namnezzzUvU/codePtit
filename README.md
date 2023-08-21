# codePtit
>> Update the remote URL with git remote set-url using the current and new remote URLs.
$ git remote set-url origin git@bitbucket.org:tutorials/tutorials.git
>> git remote add my_awesome_new_remote_repo git@git.assembla.com:portfolio/space.space_name.git
>> git remote -v ( see remote exist)
>> git branch -M main
>> git push -u origin main
>> để gửi 1 file lên 1 nhánh bất kì :
+) git init, git add, git commit -m "message".
+) git branch -M <branch_name>
+) git push -u -f <remote_name> <branch_name> (nên gửi lên 1 branch trống, vì cách này sẽ xóa all file trước đó trong branch)
+) và sau đó push k cần -u -f (vẫn cần <branch_name> và <remote_name>. file đã lưu cũng sẽ k bị xóa.
