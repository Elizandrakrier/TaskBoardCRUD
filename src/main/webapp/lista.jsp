<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>

<html>
  <head>
      <title>Title</title>
      <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">

  </head>
  <body>
    <%@include file="cabecalho.jsp"%>
    <div class="p-8">
      <h1 class="text-2xl font-bold mb-4">Minhas Tarefas</h1>
      <a href="tarefas.jsp" class="bg-green-600 text-white px-4 py-2 rounded">+ Nova Tarefa</a>
      <table class="w-full mt-6 table-auto border-collapse">
        <thead>
        <tr class="bg-gray-200">
          <th class="p-2 border">Número da tarefa</th>
          <th class="p-2 border">Título</th>
          <th class="p-2 border">Descrição</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${tarefas}" var="tarefa">
          <tr>
            <th scope="row">${tarefa.id}</th>
            <td>${tarefa.titulo}</td>
            <td>${tarefa.descricao}</td>
          </tr>
        </c:forEach>
        </tbody>
      </table>
    </div>
  </body>
</html>
