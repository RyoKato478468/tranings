FROM centos:7
RUN yum install -y java-11-openjdk which

#COPY /repo/nginx.repo /etc/yum.repos.d
#RUN yum -y install nginx

RUN curl https://bintray.com/sbt/rpm/rpm > bintray-sbt-rpm.repo
RUN mv bintray-sbt-rpm.repo /etc/yum.repos.d/
RUN yum -y install sbt

COPY 
#RUN sbt run をapp01で実行
